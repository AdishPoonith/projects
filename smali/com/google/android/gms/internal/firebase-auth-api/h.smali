.class public final Lcom/google/android/gms/internal/firebase-auth-api/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:Lf4/a;


# instance fields
.field private final a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

.field private final b:Lcom/google/android/gms/internal/firebase-auth-api/e1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lf4/a;

    const-string v1, "FirebaseAuthFallback:"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "FirebaseAuth"

    invoke-direct {v0, v2, v1}, Lf4/a;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    return-void
.end method

.method constructor <init>(Lw5/f;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lw5/f;->m()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/u;->a()Lcom/google/android/gms/internal/firebase-auth-api/u;

    move-result-object v3

    new-instance v7, Lcom/google/android/gms/internal/firebase-auth-api/rx;

    new-instance v8, Lcom/google/android/gms/internal/firebase-auth-api/v;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v8

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/v;-><init>(Lw5/f;Lcom/google/android/gms/internal/firebase-auth-api/u;Lcom/google/android/gms/internal/firebase-auth-api/u0;Lcom/google/android/gms/internal/firebase-auth-api/p;Lcom/google/android/gms/internal/firebase-auth-api/q;)V

    invoke-direct {v7, v8}, Lcom/google/android/gms/internal/firebase-auth-api/rx;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/p0;)V

    iput-object v7, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/e1;

    invoke-direct {p1, v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/e1;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->b:Lcom/google/android/gms/internal/firebase-auth-api/e1;

    return-void
.end method

.method private static i(JZ)Z
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-lez v2, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_0
    sget-object p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    const/4 p1, 0x0

    new-array p2, p1, [Ljava/lang/Object;

    const-string v0, "App hash will not be appended to the request."

    invoke-virtual {p0, v0, p2}, Lf4/a;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    return p1
.end method


# virtual methods
.method public final A(Lcom/google/android/gms/internal/firebase-auth-api/ov;Lcom/google/android/gms/internal/firebase-auth-api/f;)V
    .locals 4

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ov;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ov;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ov;->a()Lcom/google/firebase/auth/e;

    move-result-object p1

    new-instance v2, Lcom/google/android/gms/internal/firebase-auth-api/g;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    invoke-direct {v2, p2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/g;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f;Lf4/a;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->N(Ljava/lang/String;Lcom/google/firebase/auth/e;Lcom/google/android/gms/internal/firebase-auth-api/g;)V

    return-void
.end method

.method public final B(Lcom/google/android/gms/internal/firebase-auth-api/pv;Lcom/google/android/gms/internal/firebase-auth-api/f;)V
    .locals 7

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/pv;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/pv;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/pv;->a()Lcom/google/firebase/auth/e;

    move-result-object v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/pv;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/pv;->b()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lcom/google/android/gms/internal/firebase-auth-api/g;

    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    invoke-direct {v6, p2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/g;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f;Lf4/a;)V

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->O(Ljava/lang/String;Lcom/google/firebase/auth/e;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/g;)V

    return-void
.end method

.method public final C(Lcom/google/android/gms/internal/firebase-auth-api/qv;Lcom/google/android/gms/internal/firebase-auth-api/f;)V
    .locals 8

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/qv;->a()Lcom/google/android/gms/internal/firebase-auth-api/t2;

    move-result-object p1

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/t2;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/t2;->c()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lcom/google/android/gms/internal/firebase-auth-api/g;

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    invoke-direct {v7, p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/g;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f;Lf4/a;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->b:Lcom/google/android/gms/internal/firebase-auth-api/e1;

    invoke-virtual {p2, v6}, Lcom/google/android/gms/internal/firebase-auth-api/e1;->k(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/t2;->e()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->b:Lcom/google/android/gms/internal/firebase-auth-api/e1;

    invoke-virtual {p2, v6}, Lcom/google/android/gms/internal/firebase-auth-api/e1;->i(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->b:Lcom/google/android/gms/internal/firebase-auth-api/e1;

    invoke-virtual {p1, v7, v6}, Lcom/google/android/gms/internal/firebase-auth-api/e1;->h(Lcom/google/android/gms/internal/firebase-auth-api/g;Ljava/lang/String;)V

    return-void

    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/t2;->a()J

    move-result-wide v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/t2;->f()Z

    move-result v5

    invoke-static {v3, v4, v5}, Lcom/google/android/gms/internal/firebase-auth-api/h;->i(JZ)Z

    move-result p2

    if-eqz p2, :cond_2

    new-instance p2, Lcom/google/android/gms/internal/firebase-auth-api/j1;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->b:Lcom/google/android/gms/internal/firebase-auth-api/e1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/e1;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/j1;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/t2;->d(Lcom/google/android/gms/internal/firebase-auth-api/j1;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->b:Lcom/google/android/gms/internal/firebase-auth-api/e1;

    move-object v1, v6

    move-object v2, v7

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/e1;->j(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/g;JZ)V

    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->b:Lcom/google/android/gms/internal/firebase-auth-api/e1;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/a1;

    invoke-direct {v1, v0, v7, v6}, Lcom/google/android/gms/internal/firebase-auth-api/a1;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/e1;Lcom/google/android/gms/internal/firebase-auth-api/g;Ljava/lang/String;)V

    invoke-virtual {p2, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->P(Lcom/google/android/gms/internal/firebase-auth-api/t2;Lcom/google/android/gms/internal/firebase-auth-api/g;)V

    return-void
.end method

.method public final D(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/f;)V
    .locals 3

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/g;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/g;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f;Lf4/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->Q(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/g;)V

    return-void
.end method

.method public final E(Lcom/google/android/gms/internal/firebase-auth-api/i3;Lcom/google/android/gms/internal/firebase-auth-api/f;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/g;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/g;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f;Lf4/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->a(Lcom/google/android/gms/internal/firebase-auth-api/i3;Lcom/google/android/gms/internal/firebase-auth-api/g;)V

    return-void
.end method

.method public final F(Lcom/google/android/gms/internal/firebase-auth-api/l3;Lcom/google/android/gms/internal/firebase-auth-api/f;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/g;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/g;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f;Lf4/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->b(Lcom/google/android/gms/internal/firebase-auth-api/l3;Lcom/google/android/gms/internal/firebase-auth-api/g;)V

    return-void
.end method

.method public final G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/f;)V
    .locals 6

    invoke-static {p1}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p5}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p5}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    new-instance v5, Lcom/google/android/gms/internal/firebase-auth-api/g;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    invoke-direct {v5, p5, v1}, Lcom/google/android/gms/internal/firebase-auth-api/g;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f;Lf4/a;)V

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/g;)V

    return-void
.end method

.method public final H(Lcom/google/android/gms/internal/firebase-auth-api/rv;Lcom/google/android/gms/internal/firebase-auth-api/f;)V
    .locals 4

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/rv;->a()Lcom/google/firebase/auth/j;

    move-result-object v0

    invoke-static {v0}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/rv;->a()Lcom/google/firebase/auth/j;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/rv;->b()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Lcom/google/android/gms/internal/firebase-auth-api/g;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    invoke-direct {v2, p2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/g;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f;Lf4/a;)V

    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->d(Lcom/google/firebase/auth/j;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/g;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/firebase-auth-api/sv;Lcom/google/android/gms/internal/firebase-auth-api/f;)V
    .locals 3

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/sv;->a()Lcom/google/firebase/auth/o0;

    move-result-object p1

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/auth/o0;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/t0;->a(Lcom/google/firebase/auth/o0;)Lcom/google/android/gms/internal/firebase-auth-api/p3;

    move-result-object p1

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/g;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/g;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f;Lf4/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->e(Lcom/google/android/gms/internal/firebase-auth-api/p3;Lcom/google/android/gms/internal/firebase-auth-api/g;)V

    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZZLjava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/internal/firebase-auth-api/f;)V
    .locals 10

    move-object v0, p0

    move-object v7, p2

    const-string v1, "idToken should not be empty."

    move-object v2, p1

    invoke-static {p1, v1}, Lc4/s;->g(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    invoke-static/range {p11 .. p11}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v8, Lcom/google/android/gms/internal/firebase-auth-api/g;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    move-object/from16 v3, p11

    invoke-direct {v8, v3, v1}, Lcom/google/android/gms/internal/firebase-auth-api/g;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f;Lf4/a;)V

    iget-object v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/h;->b:Lcom/google/android/gms/internal/firebase-auth-api/e1;

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/e1;->k(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/h;->b:Lcom/google/android/gms/internal/firebase-auth-api/e1;

    if-eqz p6, :cond_0

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/e1;->i(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v8, p2}, Lcom/google/android/gms/internal/firebase-auth-api/e1;->h(Lcom/google/android/gms/internal/firebase-auth-api/g;Ljava/lang/String;)V

    return-void

    :cond_1
    :goto_0
    const/4 v6, 0x0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object/from16 v4, p8

    move-object/from16 v5, p9

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/c3;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/c3;

    move-result-object v9

    move-wide v4, p4

    move/from16 v6, p10

    invoke-static {p4, p5, v6}, Lcom/google/android/gms/internal/firebase-auth-api/h;->i(JZ)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/j1;

    iget-object v2, v0, Lcom/google/android/gms/internal/firebase-auth-api/h;->b:Lcom/google/android/gms/internal/firebase-auth-api/e1;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/e1;->b()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/j1;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v1}, Lcom/google/android/gms/internal/firebase-auth-api/c3;->c(Lcom/google/android/gms/internal/firebase-auth-api/j1;)V

    :cond_2
    iget-object v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/h;->b:Lcom/google/android/gms/internal/firebase-auth-api/e1;

    move-object v2, p2

    move-object v3, v8

    move-wide v4, p4

    move/from16 v6, p10

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/e1;->j(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/g;JZ)V

    iget-object v1, v0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    iget-object v2, v0, Lcom/google/android/gms/internal/firebase-auth-api/h;->b:Lcom/google/android/gms/internal/firebase-auth-api/e1;

    new-instance v3, Lcom/google/android/gms/internal/firebase-auth-api/a1;

    invoke-direct {v3, v2, v8, p2}, Lcom/google/android/gms/internal/firebase-auth-api/a1;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/e1;Lcom/google/android/gms/internal/firebase-auth-api/g;Ljava/lang/String;)V

    invoke-virtual {v1, v9, v3}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->m(Lcom/google/android/gms/internal/firebase-auth-api/c3;Lcom/google/android/gms/internal/firebase-auth-api/g;)V

    return-void
.end method

.method public final c(Lcom/google/android/gms/internal/firebase-auth-api/tv;Lcom/google/android/gms/internal/firebase-auth-api/f;)V
    .locals 15

    move-object v0, p0

    invoke-static/range {p1 .. p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/tv;->b()Lcom/google/firebase/auth/t0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/auth/t0;->j()Ljava/lang/String;

    move-result-object v1

    new-instance v8, Lcom/google/android/gms/internal/firebase-auth-api/g;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    move-object/from16 v3, p2

    invoke-direct {v8, v3, v2}, Lcom/google/android/gms/internal/firebase-auth-api/g;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f;Lf4/a;)V

    iget-object v2, v0, Lcom/google/android/gms/internal/firebase-auth-api/h;->b:Lcom/google/android/gms/internal/firebase-auth-api/e1;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/e1;->k(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/tv;->g()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/google/android/gms/internal/firebase-auth-api/h;->b:Lcom/google/android/gms/internal/firebase-auth-api/e1;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/e1;->i(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v2, v0, Lcom/google/android/gms/internal/firebase-auth-api/h;->b:Lcom/google/android/gms/internal/firebase-auth-api/e1;

    invoke-virtual {v2, v8, v1}, Lcom/google/android/gms/internal/firebase-auth-api/e1;->h(Lcom/google/android/gms/internal/firebase-auth-api/g;Ljava/lang/String;)V

    return-void

    :cond_1
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/tv;->a()J

    move-result-wide v5

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/tv;->h()Z

    move-result v7

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/tv;->d()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/tv;->b()Lcom/google/firebase/auth/t0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/firebase/auth/t0;->a()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/tv;->b()Lcom/google/firebase/auth/t0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/firebase/auth/t0;->j()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/tv;->c()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/tv;->f()Ljava/lang/String;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/firebase-auth-api/tv;->e()Ljava/lang/String;

    move-result-object v14

    invoke-static/range {v9 .. v14}, Lcom/google/android/gms/internal/firebase-auth-api/a3;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/a3;

    move-result-object v9

    invoke-static {v5, v6, v7}, Lcom/google/android/gms/internal/firebase-auth-api/h;->i(JZ)Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v2, Lcom/google/android/gms/internal/firebase-auth-api/j1;

    iget-object v3, v0, Lcom/google/android/gms/internal/firebase-auth-api/h;->b:Lcom/google/android/gms/internal/firebase-auth-api/e1;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/e1;->b()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/j1;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v2}, Lcom/google/android/gms/internal/firebase-auth-api/a3;->c(Lcom/google/android/gms/internal/firebase-auth-api/j1;)V

    :cond_2
    iget-object v2, v0, Lcom/google/android/gms/internal/firebase-auth-api/h;->b:Lcom/google/android/gms/internal/firebase-auth-api/e1;

    move-object v3, v1

    move-object v4, v8

    invoke-virtual/range {v2 .. v7}, Lcom/google/android/gms/internal/firebase-auth-api/e1;->j(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/g;JZ)V

    iget-object v2, v0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    iget-object v3, v0, Lcom/google/android/gms/internal/firebase-auth-api/h;->b:Lcom/google/android/gms/internal/firebase-auth-api/e1;

    new-instance v4, Lcom/google/android/gms/internal/firebase-auth-api/a1;

    invoke-direct {v4, v3, v8, v1}, Lcom/google/android/gms/internal/firebase-auth-api/a1;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/e1;Lcom/google/android/gms/internal/firebase-auth-api/g;Ljava/lang/String;)V

    invoke-virtual {v2, v9, v4}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->f(Lcom/google/android/gms/internal/firebase-auth-api/a3;Lcom/google/android/gms/internal/firebase-auth-api/g;)V

    return-void
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/f;)V
    .locals 3

    const-string v0, "cachedTokenState should not be empty."

    invoke-static {p1, v0}, Lc4/s;->g(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    const-string v0, "uid should not be empty."

    invoke-static {p2, v0}, Lc4/s;->g(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {p4}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/g;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    invoke-direct {v1, p4, v2}, Lcom/google/android/gms/internal/firebase-auth-api/g;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f;Lf4/a;)V

    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/g;)V

    return-void
.end method

.method public final e(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/f;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/g;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/g;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f;Lf4/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->h(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/g;)V

    return-void
.end method

.method public final f(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/f;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p3}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/g;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    invoke-direct {v1, p3, v2}, Lcom/google/android/gms/internal/firebase-auth-api/g;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f;Lf4/a;)V

    invoke-virtual {v0, p1, p2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->i(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/g;)V

    return-void
.end method

.method public final g(Ljava/lang/String;Lcom/google/firebase/auth/z0;Lcom/google/android/gms/internal/firebase-auth-api/f;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/g;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    invoke-direct {v1, p3, v2}, Lcom/google/android/gms/internal/firebase-auth-api/g;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f;Lf4/a;)V

    invoke-virtual {v0, p1, p2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->j(Ljava/lang/String;Lcom/google/firebase/auth/z0;Lcom/google/android/gms/internal/firebase-auth-api/g;)V

    return-void
.end method

.method public final h(Lcom/google/android/gms/internal/firebase-auth-api/uv;Lcom/google/android/gms/internal/firebase-auth-api/f;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/uv;->a()Lcom/google/firebase/auth/e;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/uv;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/uv;->c()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/b2;->b(Lcom/google/firebase/auth/e;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/b2;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/g;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/g;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f;Lf4/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->k(Lcom/google/android/gms/internal/firebase-auth-api/b2;Lcom/google/android/gms/internal/firebase-auth-api/g;)V

    return-void
.end method

.method public final j(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/f;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p3}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/g;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    invoke-direct {v1, p3, v2}, Lcom/google/android/gms/internal/firebase-auth-api/g;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f;Lf4/a;)V

    invoke-virtual {v0, p1, p2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->y(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/g;)V

    return-void
.end method

.method public final k(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/f;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p3}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/g;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    invoke-direct {v1, p3, v2}, Lcom/google/android/gms/internal/firebase-auth-api/g;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f;Lf4/a;)V

    invoke-virtual {v0, p1, p2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->z(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/g;)V

    return-void
.end method

.method public final l(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/f;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p3}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/g;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    invoke-direct {v1, p3, v2}, Lcom/google/android/gms/internal/firebase-auth-api/g;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f;Lf4/a;)V

    invoke-virtual {v0, p1, p2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->A(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/g;)V

    return-void
.end method

.method public final m(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/f;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p3}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/g;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    invoke-direct {v1, p3, v2}, Lcom/google/android/gms/internal/firebase-auth-api/g;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f;Lf4/a;)V

    invoke-virtual {v0, p1, p2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->B(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/g;)V

    return-void
.end method

.method public final n(Lcom/google/android/gms/internal/firebase-auth-api/kv;Lcom/google/android/gms/internal/firebase-auth-api/f;)V
    .locals 5

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/kv;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/kv;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/kv;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/kv;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/kv;->c()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Lcom/google/android/gms/internal/firebase-auth-api/g;

    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    invoke-direct {v3, p2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/g;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f;Lf4/a;)V

    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/g;)V

    return-void
.end method

.method public final o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/f;)V
    .locals 6

    invoke-static {p1}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p5}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    new-instance v5, Lcom/google/android/gms/internal/firebase-auth-api/g;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    invoke-direct {v5, p5, v1}, Lcom/google/android/gms/internal/firebase-auth-api/g;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f;Lf4/a;)V

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->D(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/g;)V

    return-void
.end method

.method public final p(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/f;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/g;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/g;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f;Lf4/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->E(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/g;)V

    return-void
.end method

.method public final q(Lcom/google/firebase/auth/i0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/f;)V
    .locals 2

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    const-string p4, "cachedTokenState should not be empty."

    invoke-static {p2, p4}, Lc4/s;->g(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {p5}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of p4, p1, Lcom/google/firebase/auth/r0;

    if-eqz p4, :cond_0

    check-cast p1, Lcom/google/firebase/auth/r0;

    invoke-virtual {p1}, Lcom/google/firebase/auth/r0;->a()Lcom/google/firebase/auth/o0;

    move-result-object p1

    iget-object p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    invoke-virtual {p1}, Lcom/google/firebase/auth/o0;->K()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/firebase/auth/o0;->E()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {p2, v0, p1, p3, v1}, Lcom/google/android/gms/internal/firebase-auth-api/t1;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/t1;

    move-result-object p1

    new-instance p3, Lcom/google/android/gms/internal/firebase-auth-api/g;

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    invoke-direct {p3, p5, v0}, Lcom/google/android/gms/internal/firebase-auth-api/g;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f;Lf4/a;)V

    invoke-virtual {p4, p1, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->l(Lcom/google/android/gms/internal/firebase-auth-api/t1;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/g;)V

    return-void

    :cond_0
    instance-of p1, p1, Lcom/google/firebase/auth/s1;

    if-eqz p1, :cond_1

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Not implemented"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final r(Ljava/lang/String;Lcom/google/firebase/auth/i0;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/f;)V
    .locals 2

    invoke-static {p1}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v0, p2, Lcom/google/firebase/auth/r0;

    if-eqz v0, :cond_0

    check-cast p2, Lcom/google/firebase/auth/r0;

    invoke-virtual {p2}, Lcom/google/firebase/auth/r0;->a()Lcom/google/firebase/auth/o0;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    invoke-virtual {p2}, Lcom/google/firebase/auth/o0;->K()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p2}, Lcom/google/firebase/auth/o0;->E()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-static {p1, v1, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/u1;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/u1;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/firebase-auth-api/g;

    sget-object p3, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    invoke-direct {p2, p4, p3}, Lcom/google/android/gms/internal/firebase-auth-api/g;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f;Lf4/a;)V

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->n(Lcom/google/android/gms/internal/firebase-auth-api/u1;Lcom/google/android/gms/internal/firebase-auth-api/g;)V

    return-void

    :cond_0
    instance-of p1, p2, Lcom/google/firebase/auth/s1;

    if-eqz p1, :cond_1

    check-cast p2, Lcom/google/firebase/auth/s1;

    const/4 p1, 0x0

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final s(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/f;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/g;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/g;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f;Lf4/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->F(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/g;)V

    return-void
.end method

.method public final t(Lcom/google/android/gms/internal/firebase-auth-api/lv;Lcom/google/android/gms/internal/firebase-auth-api/f;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/d2;->a()Lcom/google/android/gms/internal/firebase-auth-api/d2;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/g;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/g;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f;Lf4/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->G(Lcom/google/android/gms/internal/firebase-auth-api/d2;Lcom/google/android/gms/internal/firebase-auth-api/g;)V

    return-void
.end method

.method public final u(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/f;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/g;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    invoke-direct {v1, p3, v2}, Lcom/google/android/gms/internal/firebase-auth-api/g;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f;Lf4/a;)V

    invoke-virtual {v0, p1, p2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->H(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/g;)V

    return-void
.end method

.method public final v(Lcom/google/android/gms/internal/firebase-auth-api/mv;Lcom/google/android/gms/internal/firebase-auth-api/f;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/mv;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/mv;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/h2;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/h2;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/g;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/g;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f;Lf4/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->I(Lcom/google/android/gms/internal/firebase-auth-api/h2;Lcom/google/android/gms/internal/firebase-auth-api/g;)V

    return-void
.end method

.method public final w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/f;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p3}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p4}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/g;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    invoke-direct {v1, p4, v2}, Lcom/google/android/gms/internal/firebase-auth-api/g;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f;Lf4/a;)V

    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->J(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/g;)V

    return-void
.end method

.method public final x(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/i3;Lcom/google/android/gms/internal/firebase-auth-api/f;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/g;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    invoke-direct {v1, p3, v2}, Lcom/google/android/gms/internal/firebase-auth-api/g;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f;Lf4/a;)V

    invoke-virtual {v0, p1, p2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->K(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/i3;Lcom/google/android/gms/internal/firebase-auth-api/g;)V

    return-void
.end method

.method public final y(Lcom/google/android/gms/internal/firebase-auth-api/nv;Lcom/google/android/gms/internal/firebase-auth-api/f;)V
    .locals 4

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/nv;->a()Lcom/google/firebase/auth/o0;

    move-result-object v0

    invoke-static {v0}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/auth/o0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/nv;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/t0;->a(Lcom/google/firebase/auth/o0;)Lcom/google/android/gms/internal/firebase-auth-api/p3;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/firebase-auth-api/g;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    invoke-direct {v2, p2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/g;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f;Lf4/a;)V

    invoke-virtual {v1, p1, v0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->L(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/p3;Lcom/google/android/gms/internal/firebase-auth-api/g;)V

    return-void
.end method

.method public final z(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/f;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/h;->a:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/g;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/h;->c:Lf4/a;

    invoke-direct {v1, p2, v2}, Lcom/google/android/gms/internal/firebase-auth-api/g;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f;Lf4/a;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->M(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/g;)V

    return-void
.end method
