.class public final Ld3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls1/h;


# static fields
.field public static final l:Ld3/e;

.field private static final m:Ljava/lang/String;

.field private static final n:Ljava/lang/String;

.field public static final o:Ls1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls1/h$a<",
            "Ld3/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final j:Lcom/google/common/collect/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/q<",
            "Ld3/b;",
            ">;"
        }
    .end annotation
.end field

.field public final k:J


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ld3/e;

    invoke-static {}, Lcom/google/common/collect/q;->z()Lcom/google/common/collect/q;

    move-result-object v1

    const-wide/16 v2, 0x0

    invoke-direct {v0, v1, v2, v3}, Ld3/e;-><init>(Ljava/util/List;J)V

    sput-object v0, Ld3/e;->l:Ld3/e;

    const/4 v0, 0x0

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ld3/e;->m:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ld3/e;->n:Ljava/lang/String;

    sget-object v0, Ld3/d;->a:Ld3/d;

    sput-object v0, Ld3/e;->o:Ls1/h$a;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ld3/b;",
            ">;J)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/common/collect/q;->v(Ljava/util/Collection;)Lcom/google/common/collect/q;

    move-result-object p1

    iput-object p1, p0, Ld3/e;->j:Lcom/google/common/collect/q;

    iput-wide p2, p0, Ld3/e;->k:J

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ld3/e;
    .locals 0

    invoke-static {p0}, Ld3/e;->b(Landroid/os/Bundle;)Ld3/e;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Landroid/os/Bundle;)Ld3/e;
    .locals 3

    sget-object v0, Ld3/e;->m:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/common/collect/q;->z()Lcom/google/common/collect/q;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v1, Ld3/b;->S:Ls1/h$a;

    invoke-static {v1, v0}, Lp3/c;->b(Ls1/h$a;Ljava/util/List;)Lcom/google/common/collect/q;

    move-result-object v0

    :goto_0
    sget-object v1, Ld3/e;->n:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    new-instance p0, Ld3/e;

    invoke-direct {p0, v0, v1, v2}, Ld3/e;-><init>(Ljava/util/List;J)V

    return-object p0
.end method
