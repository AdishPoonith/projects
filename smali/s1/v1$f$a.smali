.class public final Ls1/v1$f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/v1$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/util/UUID;

.field private b:Landroid/net/Uri;

.field private c:Lcom/google/common/collect/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/r<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:Lcom/google/common/collect/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/q<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private h:[B


# direct methods
.method private constructor <init>()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/common/collect/r;->j()Lcom/google/common/collect/r;

    move-result-object v0

    iput-object v0, p0, Ls1/v1$f$a;->c:Lcom/google/common/collect/r;

    invoke-static {}, Lcom/google/common/collect/q;->z()Lcom/google/common/collect/q;

    move-result-object v0

    iput-object v0, p0, Ls1/v1$f$a;->g:Lcom/google/common/collect/q;

    return-void
.end method

.method synthetic constructor <init>(Ls1/v1$a;)V
    .locals 0

    invoke-direct {p0}, Ls1/v1$f$a;-><init>()V

    return-void
.end method

.method private constructor <init>(Ls1/v1$f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Ls1/v1$f;->a:Ljava/util/UUID;

    iput-object v0, p0, Ls1/v1$f$a;->a:Ljava/util/UUID;

    iget-object v0, p1, Ls1/v1$f;->c:Landroid/net/Uri;

    iput-object v0, p0, Ls1/v1$f$a;->b:Landroid/net/Uri;

    iget-object v0, p1, Ls1/v1$f;->e:Lcom/google/common/collect/r;

    iput-object v0, p0, Ls1/v1$f$a;->c:Lcom/google/common/collect/r;

    iget-boolean v0, p1, Ls1/v1$f;->f:Z

    iput-boolean v0, p0, Ls1/v1$f$a;->d:Z

    iget-boolean v0, p1, Ls1/v1$f;->g:Z

    iput-boolean v0, p0, Ls1/v1$f$a;->e:Z

    iget-boolean v0, p1, Ls1/v1$f;->h:Z

    iput-boolean v0, p0, Ls1/v1$f$a;->f:Z

    iget-object v0, p1, Ls1/v1$f;->j:Lcom/google/common/collect/q;

    iput-object v0, p0, Ls1/v1$f$a;->g:Lcom/google/common/collect/q;

    invoke-static {p1}, Ls1/v1$f;->a(Ls1/v1$f;)[B

    move-result-object p1

    iput-object p1, p0, Ls1/v1$f$a;->h:[B

    return-void
.end method

.method synthetic constructor <init>(Ls1/v1$f;Ls1/v1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ls1/v1$f$a;-><init>(Ls1/v1$f;)V

    return-void
.end method

.method static synthetic a(Ls1/v1$f$a;)Z
    .locals 0

    iget-boolean p0, p0, Ls1/v1$f$a;->d:Z

    return p0
.end method

.method static synthetic b(Ls1/v1$f$a;)Z
    .locals 0

    iget-boolean p0, p0, Ls1/v1$f$a;->e:Z

    return p0
.end method

.method static synthetic c(Ls1/v1$f$a;)Lcom/google/common/collect/q;
    .locals 0

    iget-object p0, p0, Ls1/v1$f$a;->g:Lcom/google/common/collect/q;

    return-object p0
.end method

.method static synthetic d(Ls1/v1$f$a;)[B
    .locals 0

    iget-object p0, p0, Ls1/v1$f$a;->h:[B

    return-object p0
.end method

.method static synthetic e(Ls1/v1$f$a;)Landroid/net/Uri;
    .locals 0

    iget-object p0, p0, Ls1/v1$f$a;->b:Landroid/net/Uri;

    return-object p0
.end method

.method static synthetic f(Ls1/v1$f$a;)Ljava/util/UUID;
    .locals 0

    iget-object p0, p0, Ls1/v1$f$a;->a:Ljava/util/UUID;

    return-object p0
.end method

.method static synthetic g(Ls1/v1$f$a;)Z
    .locals 0

    iget-boolean p0, p0, Ls1/v1$f$a;->f:Z

    return p0
.end method

.method static synthetic h(Ls1/v1$f$a;)Lcom/google/common/collect/r;
    .locals 0

    iget-object p0, p0, Ls1/v1$f$a;->c:Lcom/google/common/collect/r;

    return-object p0
.end method


# virtual methods
.method public i()Ls1/v1$f;
    .locals 2

    new-instance v0, Ls1/v1$f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ls1/v1$f;-><init>(Ls1/v1$f$a;Ls1/v1$a;)V

    return-object v0
.end method
