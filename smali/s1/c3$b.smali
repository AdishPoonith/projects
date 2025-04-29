.class public final Ls1/c3$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls1/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/c3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls1/c3$b$a;
    }
.end annotation


# static fields
.field public static final k:Ls1/c3$b;

.field private static final l:Ljava/lang/String;

.field public static final m:Ls1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls1/h$a<",
            "Ls1/c3$b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final j:Lp3/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls1/c3$b$a;

    invoke-direct {v0}, Ls1/c3$b$a;-><init>()V

    invoke-virtual {v0}, Ls1/c3$b$a;->e()Ls1/c3$b;

    move-result-object v0

    sput-object v0, Ls1/c3$b;->k:Ls1/c3$b;

    const/4 v0, 0x0

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/c3$b;->l:Ljava/lang/String;

    sget-object v0, Ls1/d3;->a:Ls1/d3;

    sput-object v0, Ls1/c3$b;->m:Ls1/h$a;

    return-void
.end method

.method private constructor <init>(Lp3/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/c3$b;->j:Lp3/l;

    return-void
.end method

.method synthetic constructor <init>(Lp3/l;Ls1/c3$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ls1/c3$b;-><init>(Lp3/l;)V

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ls1/c3$b;
    .locals 0

    invoke-static {p0}, Ls1/c3$b;->c(Landroid/os/Bundle;)Ls1/c3$b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic b(Ls1/c3$b;)Lp3/l;
    .locals 0

    iget-object p0, p0, Ls1/c3$b;->j:Lp3/l;

    return-object p0
.end method

.method private static c(Landroid/os/Bundle;)Ls1/c3$b;
    .locals 3

    sget-object v0, Ls1/c3$b;->l:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getIntegerArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p0

    if-nez p0, :cond_0

    sget-object p0, Ls1/c3$b;->k:Ls1/c3$b;

    return-object p0

    :cond_0
    new-instance v0, Ls1/c3$b$a;

    invoke-direct {v0}, Ls1/c3$b$a;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v0, v2}, Ls1/c3$b$a;->a(I)Ls1/c3$b$a;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ls1/c3$b$a;->e()Ls1/c3$b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Ls1/c3$b;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Ls1/c3$b;

    iget-object v0, p0, Ls1/c3$b;->j:Lp3/l;

    iget-object p1, p1, Ls1/c3$b;->j:Lp3/l;

    invoke-virtual {v0, p1}, Lp3/l;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Ls1/c3$b;->j:Lp3/l;

    invoke-virtual {v0}, Lp3/l;->hashCode()I

    move-result v0

    return v0
.end method
