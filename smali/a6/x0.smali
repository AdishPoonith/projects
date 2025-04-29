.class public final La6/x0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private volatile a:I

.field private final b:La6/p;

.field private volatile c:Z


# direct methods
.method public constructor <init>(Lw5/f;)V
    .locals 2

    invoke-virtual {p1}, Lw5/f;->m()Landroid/content/Context;

    move-result-object v0

    new-instance v1, La6/p;

    invoke-direct {v1, p1}, La6/p;-><init>(Lw5/f;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, La6/x0;->c:Z

    iput p1, p0, La6/x0;->a:I

    iput-object v1, p0, La6/x0;->b:La6/p;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    invoke-static {p1}, Lcom/google/android/gms/common/api/internal/c;->c(Landroid/app/Application;)V

    invoke-static {}, Lcom/google/android/gms/common/api/internal/c;->b()Lcom/google/android/gms/common/api/internal/c;

    move-result-object p1

    new-instance v0, La6/w0;

    invoke-direct {v0, p0}, La6/w0;-><init>(La6/x0;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/internal/c;->a(Lcom/google/android/gms/common/api/internal/c$a;)V

    return-void
.end method

.method static bridge synthetic a(La6/x0;)La6/p;
    .locals 0

    iget-object p0, p0, La6/x0;->b:La6/p;

    return-object p0
.end method

.method static bridge synthetic b(La6/x0;Z)V
    .locals 0

    iput-boolean p1, p0, La6/x0;->c:Z

    return-void
.end method

.method static bridge synthetic f(La6/x0;)Z
    .locals 0

    invoke-direct {p0}, La6/x0;->g()Z

    move-result p0

    return p0
.end method

.method private final g()Z
    .locals 1

    iget v0, p0, La6/x0;->a:I

    if-lez v0, :cond_0

    iget-boolean v0, p0, La6/x0;->c:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final c()V
    .locals 1

    iget-object v0, p0, La6/x0;->b:La6/p;

    invoke-virtual {v0}, La6/p;->b()V

    return-void
.end method

.method public final d(I)V
    .locals 1

    if-lez p1, :cond_0

    iget v0, p0, La6/x0;->a:I

    if-nez v0, :cond_0

    iput p1, p0, La6/x0;->a:I

    invoke-direct {p0}, La6/x0;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, La6/x0;->b:La6/p;

    invoke-virtual {v0}, La6/p;->c()V

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    iget v0, p0, La6/x0;->a:I

    if-eqz v0, :cond_1

    iget-object v0, p0, La6/x0;->b:La6/p;

    invoke-virtual {v0}, La6/p;->b()V

    :cond_1
    :goto_0
    iput p1, p0, La6/x0;->a:I

    return-void
.end method

.method public final e(Lcom/google/android/gms/internal/firebase-auth-api/j2;)V
    .locals 6

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/j2;->B()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_1

    const-wide/16 v0, 0xe10

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/j2;->C()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    mul-long v0, v0, v4

    add-long/2addr v2, v0

    iget-object p1, p0, La6/x0;->b:La6/p;

    iput-wide v2, p1, La6/p;->b:J

    const-wide/16 v0, -0x1

    iput-wide v0, p1, La6/p;->c:J

    invoke-direct {p0}, La6/x0;->g()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, La6/x0;->b:La6/p;

    invoke-virtual {p1}, La6/p;->c()V

    :cond_2
    return-void
.end method
