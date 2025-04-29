.class public final Ls1/d4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls1/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls1/d4$a;
    }
.end annotation


# static fields
.field public static final k:Ls1/d4;

.field private static final l:Ljava/lang/String;

.field public static final m:Ls1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls1/h$a<",
            "Ls1/d4;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final j:Lcom/google/common/collect/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/q<",
            "Ls1/d4$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ls1/d4;

    invoke-static {}, Lcom/google/common/collect/q;->z()Lcom/google/common/collect/q;

    move-result-object v1

    invoke-direct {v0, v1}, Ls1/d4;-><init>(Ljava/util/List;)V

    sput-object v0, Ls1/d4;->k:Ls1/d4;

    const/4 v0, 0x0

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/d4;->l:Ljava/lang/String;

    sget-object v0, Ls1/b4;->a:Ls1/b4;

    sput-object v0, Ls1/d4;->m:Ls1/h$a;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ls1/d4$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/common/collect/q;->v(Ljava/util/Collection;)Lcom/google/common/collect/q;

    move-result-object p1

    iput-object p1, p0, Ls1/d4;->j:Lcom/google/common/collect/q;

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ls1/d4;
    .locals 0

    invoke-static {p0}, Ls1/d4;->d(Landroid/os/Bundle;)Ls1/d4;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic d(Landroid/os/Bundle;)Ls1/d4;
    .locals 1

    sget-object v0, Ls1/d4;->l:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p0

    if-nez p0, :cond_0

    invoke-static {}, Lcom/google/common/collect/q;->z()Lcom/google/common/collect/q;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object v0, Ls1/d4$a;->s:Ls1/h$a;

    invoke-static {v0, p0}, Lp3/c;->b(Ls1/h$a;Ljava/util/List;)Lcom/google/common/collect/q;

    move-result-object p0

    :goto_0
    new-instance v0, Ls1/d4;

    invoke-direct {v0, p0}, Ls1/d4;-><init>(Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/google/common/collect/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/collect/q<",
            "Ls1/d4$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ls1/d4;->j:Lcom/google/common/collect/q;

    return-object v0
.end method

.method public c(I)Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Ls1/d4;->j:Lcom/google/common/collect/q;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Ls1/d4;->j:Lcom/google/common/collect/q;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls1/d4$a;

    invoke-virtual {v2}, Ls1/d4$a;->d()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ls1/d4$a;->c()I

    move-result v2

    if-ne v2, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    const-class v0, Ls1/d4;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Ls1/d4;

    iget-object v0, p0, Ls1/d4;->j:Lcom/google/common/collect/q;

    iget-object p1, p1, Ls1/d4;->j:Lcom/google/common/collect/q;

    invoke-virtual {v0, p1}, Lcom/google/common/collect/q;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Ls1/d4;->j:Lcom/google/common/collect/q;

    invoke-virtual {v0}, Lcom/google/common/collect/q;->hashCode()I

    move-result v0

    return v0
.end method
