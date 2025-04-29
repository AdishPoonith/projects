.class public final Lu1/c0$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu1/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# instance fields
.field private a:Lu1/f;

.field private b:Lu1/h;

.field private c:Z

.field private d:Z

.field private e:I

.field f:Lu1/c0$e;

.field g:Ls1/s$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lu1/f;->c:Lu1/f;

    iput-object v0, p0, Lu1/c0$f;->a:Lu1/f;

    const/4 v0, 0x0

    iput v0, p0, Lu1/c0$f;->e:I

    sget-object v0, Lu1/c0$e;->a:Lu1/c0$e;

    iput-object v0, p0, Lu1/c0$f;->f:Lu1/c0$e;

    return-void
.end method

.method static synthetic a(Lu1/c0$f;)Lu1/f;
    .locals 0

    iget-object p0, p0, Lu1/c0$f;->a:Lu1/f;

    return-object p0
.end method

.method static synthetic b(Lu1/c0$f;)Lu1/h;
    .locals 0

    iget-object p0, p0, Lu1/c0$f;->b:Lu1/h;

    return-object p0
.end method

.method static synthetic c(Lu1/c0$f;)Z
    .locals 0

    iget-boolean p0, p0, Lu1/c0$f;->c:Z

    return p0
.end method

.method static synthetic d(Lu1/c0$f;)Z
    .locals 0

    iget-boolean p0, p0, Lu1/c0$f;->d:Z

    return p0
.end method

.method static synthetic e(Lu1/c0$f;)I
    .locals 0

    iget p0, p0, Lu1/c0$f;->e:I

    return p0
.end method


# virtual methods
.method public f()Lu1/c0;
    .locals 2

    iget-object v0, p0, Lu1/c0$f;->b:Lu1/h;

    if-nez v0, :cond_0

    new-instance v0, Lu1/c0$h;

    const/4 v1, 0x0

    new-array v1, v1, [Lu1/g;

    invoke-direct {v0, v1}, Lu1/c0$h;-><init>([Lu1/g;)V

    iput-object v0, p0, Lu1/c0$f;->b:Lu1/h;

    :cond_0
    new-instance v0, Lu1/c0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lu1/c0;-><init>(Lu1/c0$f;Lu1/c0$a;)V

    return-object v0
.end method

.method public g(Lu1/f;)Lu1/c0$f;
    .locals 0

    invoke-static {p1}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lu1/c0$f;->a:Lu1/f;

    return-object p0
.end method

.method public h(Z)Lu1/c0$f;
    .locals 0

    iput-boolean p1, p0, Lu1/c0$f;->d:Z

    return-object p0
.end method

.method public i(Z)Lu1/c0$f;
    .locals 0

    iput-boolean p1, p0, Lu1/c0$f;->c:Z

    return-object p0
.end method

.method public j(I)Lu1/c0$f;
    .locals 0

    iput p1, p0, Lu1/c0$f;->e:I

    return-object p0
.end method
