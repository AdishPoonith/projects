.class final Lcom/google/android/gms/internal/firebase-auth-api/v;
.super Lcom/google/android/gms/internal/firebase-auth-api/p0;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/h1;


# instance fields
.field private a:Lcom/google/android/gms/internal/firebase-auth-api/p;

.field private b:Lcom/google/android/gms/internal/firebase-auth-api/q;

.field private c:Lcom/google/android/gms/internal/firebase-auth-api/u0;

.field private final d:Lcom/google/android/gms/internal/firebase-auth-api/u;

.field private final e:Lw5/f;

.field private final f:Ljava/lang/String;

.field g:Lcom/google/android/gms/internal/firebase-auth-api/w;


# direct methods
.method constructor <init>(Lw5/f;Lcom/google/android/gms/internal/firebase-auth-api/u;Lcom/google/android/gms/internal/firebase-auth-api/u0;Lcom/google/android/gms/internal/firebase-auth-api/p;Lcom/google/android/gms/internal/firebase-auth-api/q;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/p0;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->e:Lw5/f;

    invoke-virtual {p1}, Lw5/f;->r()Lw5/n;

    move-result-object p1

    invoke-virtual {p1}, Lw5/n;->b()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->f:Ljava/lang/String;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/u;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->d:Lcom/google/android/gms/internal/firebase-auth-api/u;

    const/4 p2, 0x0

    invoke-direct {p0, p2, p2, p2}, Lcom/google/android/gms/internal/firebase-auth-api/v;->w(Lcom/google/android/gms/internal/firebase-auth-api/u0;Lcom/google/android/gms/internal/firebase-auth-api/p;Lcom/google/android/gms/internal/firebase-auth-api/q;)V

    invoke-static {p1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/i1;->e(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/h1;)V

    return-void
.end method

.method private final v()Lcom/google/android/gms/internal/firebase-auth-api/w;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->g:Lcom/google/android/gms/internal/firebase-auth-api/w;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/w;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->e:Lw5/f;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->d:Lcom/google/android/gms/internal/firebase-auth-api/u;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/u;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lw5/f;->m()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v0, v3, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/w;-><init>(Landroid/content/Context;Lw5/f;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->g:Lcom/google/android/gms/internal/firebase-auth-api/w;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->g:Lcom/google/android/gms/internal/firebase-auth-api/w;

    return-object v0
.end method

.method private final w(Lcom/google/android/gms/internal/firebase-auth-api/u0;Lcom/google/android/gms/internal/firebase-auth-api/p;Lcom/google/android/gms/internal/firebase-auth-api/q;)V
    .locals 1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->c:Lcom/google/android/gms/internal/firebase-auth-api/u0;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->a:Lcom/google/android/gms/internal/firebase-auth-api/p;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->b:Lcom/google/android/gms/internal/firebase-auth-api/q;

    const-string p1, "firebear.secureToken"

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/f1;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    const-string p3, "LocalClient"

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->f:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/i1;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "Found hermetic configuration for secureToken URL: "

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p3, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->c:Lcom/google/android/gms/internal/firebase-auth-api/u0;

    if-nez p2, :cond_1

    new-instance p2, Lcom/google/android/gms/internal/firebase-auth-api/u0;

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/v;->v()Lcom/google/android/gms/internal/firebase-auth-api/w;

    move-result-object v0

    invoke-direct {p2, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/u0;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/w;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->c:Lcom/google/android/gms/internal/firebase-auth-api/u0;

    :cond_1
    const-string p1, "firebear.identityToolkit"

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/f1;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->f:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/i1;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_2
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "Found hermetic configuration for identityToolkit URL: "

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p3, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->a:Lcom/google/android/gms/internal/firebase-auth-api/p;

    if-nez p2, :cond_3

    new-instance p2, Lcom/google/android/gms/internal/firebase-auth-api/p;

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/v;->v()Lcom/google/android/gms/internal/firebase-auth-api/w;

    move-result-object v0

    invoke-direct {p2, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/p;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/w;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->a:Lcom/google/android/gms/internal/firebase-auth-api/p;

    :cond_3
    const-string p1, "firebear.identityToolkitV2"

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/f1;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_4

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->f:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/i1;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_4
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "Found hermetic configuration for identityToolkitV2 URL: "

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p3, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_2
    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->b:Lcom/google/android/gms/internal/firebase-auth-api/q;

    if-nez p2, :cond_5

    new-instance p2, Lcom/google/android/gms/internal/firebase-auth-api/q;

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/v;->v()Lcom/google/android/gms/internal/firebase-auth-api/w;

    move-result-object p3

    invoke-direct {p2, p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/q;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/w;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->b:Lcom/google/android/gms/internal/firebase-auth-api/q;

    :cond_5
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/firebase-auth-api/m1;Lcom/google/android/gms/internal/firebase-auth-api/o0;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->a:Lcom/google/android/gms/internal/firebase-auth-api/p;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->f:Ljava/lang/String;

    const-string v2, "/createAuthUri"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/o;->b:Lcom/google/android/gms/internal/firebase-auth-api/w;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/n1;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/r0;->b(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/s;Lcom/google/android/gms/internal/firebase-auth-api/o0;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/w;)V

    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/firebase-auth-api/o1;Lcom/google/android/gms/internal/firebase-auth-api/o0;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->a:Lcom/google/android/gms/internal/firebase-auth-api/p;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->f:Ljava/lang/String;

    const-string v2, "/deleteAccount"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/o;->b:Lcom/google/android/gms/internal/firebase-auth-api/w;

    const-class v2, Ljava/lang/Void;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/r0;->b(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/s;Lcom/google/android/gms/internal/firebase-auth-api/o0;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/w;)V

    return-void
.end method

.method public final c(Lcom/google/android/gms/internal/firebase-auth-api/p1;Lcom/google/android/gms/internal/firebase-auth-api/o0;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->a:Lcom/google/android/gms/internal/firebase-auth-api/p;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->f:Ljava/lang/String;

    const-string v2, "/emailLinkSignin"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/o;->b:Lcom/google/android/gms/internal/firebase-auth-api/w;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/q1;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/r0;->b(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/s;Lcom/google/android/gms/internal/firebase-auth-api/o0;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/w;)V

    return-void
.end method

.method public final d(Lcom/google/android/gms/internal/firebase-auth-api/w1;Lcom/google/android/gms/internal/firebase-auth-api/o0;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->c:Lcom/google/android/gms/internal/firebase-auth-api/u0;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->f:Ljava/lang/String;

    const-string v2, "/token"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/o;->b:Lcom/google/android/gms/internal/firebase-auth-api/w;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/j2;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/r0;->b(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/s;Lcom/google/android/gms/internal/firebase-auth-api/o0;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/w;)V

    return-void
.end method

.method public final e(Lcom/google/android/gms/internal/firebase-auth-api/x1;Lcom/google/android/gms/internal/firebase-auth-api/o0;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->a:Lcom/google/android/gms/internal/firebase-auth-api/p;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->f:Ljava/lang/String;

    const-string v2, "/getAccountInfo"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/o;->b:Lcom/google/android/gms/internal/firebase-auth-api/w;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/y1;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/r0;->b(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/s;Lcom/google/android/gms/internal/firebase-auth-api/o0;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/w;)V

    return-void
.end method

.method public final f(Lcom/google/android/gms/internal/firebase-auth-api/b2;Lcom/google/android/gms/internal/firebase-auth-api/o0;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/b2;->a()Lcom/google/firebase/auth/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/v;->v()Lcom/google/android/gms/internal/firebase-auth-api/w;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/b2;->a()Lcom/google/firebase/auth/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/auth/e;->M()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/w;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->a:Lcom/google/android/gms/internal/firebase-auth-api/p;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->f:Ljava/lang/String;

    const-string v2, "/getOobConfirmationCode"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/o;->b:Lcom/google/android/gms/internal/firebase-auth-api/w;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/c2;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/r0;->b(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/s;Lcom/google/android/gms/internal/firebase-auth-api/o0;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/w;)V

    return-void
.end method

.method public final g(Lcom/google/android/gms/internal/firebase-auth-api/d2;Lcom/google/android/gms/internal/firebase-auth-api/o0;)V
    .locals 2

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->a:Lcom/google/android/gms/internal/firebase-auth-api/p;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->f:Ljava/lang/String;

    const-string v1, "/getRecaptchaParam"

    invoke-virtual {p1, v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object p1, p1, Lcom/google/android/gms/internal/firebase-auth-api/o;->b:Lcom/google/android/gms/internal/firebase-auth-api/w;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/f2;

    invoke-static {v0, p2, v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/r0;->a(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/o0;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/w;)V

    return-void
.end method

.method public final h(Lcom/google/android/gms/internal/firebase-auth-api/h2;Lcom/google/android/gms/internal/firebase-auth-api/o0;)V
    .locals 4

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->b:Lcom/google/android/gms/internal/firebase-auth-api/q;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->f:Ljava/lang/String;

    const-string v2, "/recaptchaConfig"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/h2;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/h2;->c()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&clientType="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&version="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/o;->b:Lcom/google/android/gms/internal/firebase-auth-api/w;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/i2;

    invoke-static {p1, p2, v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/r0;->a(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/o0;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/w;)V

    return-void
.end method

.method public final i(Lcom/google/android/gms/internal/firebase-auth-api/r2;Lcom/google/android/gms/internal/firebase-auth-api/o0;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->a:Lcom/google/android/gms/internal/firebase-auth-api/p;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->f:Ljava/lang/String;

    const-string v2, "/resetPassword"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/o;->b:Lcom/google/android/gms/internal/firebase-auth-api/w;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/s2;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/r0;->b(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/s;Lcom/google/android/gms/internal/firebase-auth-api/o0;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/w;)V

    return-void
.end method

.method public final j(Lcom/google/android/gms/internal/firebase-auth-api/t2;Lcom/google/android/gms/internal/firebase-auth-api/o0;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/t2;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/v;->v()Lcom/google/android/gms/internal/firebase-auth-api/w;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/t2;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/w;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->a:Lcom/google/android/gms/internal/firebase-auth-api/p;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->f:Ljava/lang/String;

    const-string v2, "/sendVerificationCode"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/o;->b:Lcom/google/android/gms/internal/firebase-auth-api/w;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/u2;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/r0;->b(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/s;Lcom/google/android/gms/internal/firebase-auth-api/o0;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/w;)V

    return-void
.end method

.method public final k(Lcom/google/android/gms/internal/firebase-auth-api/v2;Lcom/google/android/gms/internal/firebase-auth-api/o0;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->a:Lcom/google/android/gms/internal/firebase-auth-api/p;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->f:Ljava/lang/String;

    const-string v2, "/setAccountInfo"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/o;->b:Lcom/google/android/gms/internal/firebase-auth-api/w;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/w2;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/r0;->b(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/s;Lcom/google/android/gms/internal/firebase-auth-api/o0;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/w;)V

    return-void
.end method

.method public final l(Lcom/google/android/gms/internal/firebase-auth-api/x2;Lcom/google/android/gms/internal/firebase-auth-api/o0;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->a:Lcom/google/android/gms/internal/firebase-auth-api/p;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->f:Ljava/lang/String;

    const-string v2, "/signupNewUser"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/o;->b:Lcom/google/android/gms/internal/firebase-auth-api/w;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/y2;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/r0;->b(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/s;Lcom/google/android/gms/internal/firebase-auth-api/o0;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/w;)V

    return-void
.end method

.method public final m(Lcom/google/android/gms/internal/firebase-auth-api/a3;Lcom/google/android/gms/internal/firebase-auth-api/o0;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/a3;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/v;->v()Lcom/google/android/gms/internal/firebase-auth-api/w;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/a3;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/w;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->b:Lcom/google/android/gms/internal/firebase-auth-api/q;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->f:Ljava/lang/String;

    const-string v2, "/accounts/mfaSignIn:start"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/o;->b:Lcom/google/android/gms/internal/firebase-auth-api/w;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/b3;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/r0;->b(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/s;Lcom/google/android/gms/internal/firebase-auth-api/o0;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/w;)V

    return-void
.end method

.method public final n(Lcom/google/android/gms/internal/firebase-auth-api/i3;Lcom/google/android/gms/internal/firebase-auth-api/o0;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->a:Lcom/google/android/gms/internal/firebase-auth-api/p;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->f:Ljava/lang/String;

    const-string v2, "/verifyAssertion"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/o;->b:Lcom/google/android/gms/internal/firebase-auth-api/w;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/k3;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/r0;->b(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/s;Lcom/google/android/gms/internal/firebase-auth-api/o0;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/w;)V

    return-void
.end method

.method public final o(Lcom/google/android/gms/internal/firebase-auth-api/l3;Lcom/google/android/gms/internal/firebase-auth-api/o0;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->a:Lcom/google/android/gms/internal/firebase-auth-api/p;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->f:Ljava/lang/String;

    const-string v2, "/verifyCustomToken"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/o;->b:Lcom/google/android/gms/internal/firebase-auth-api/w;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/m3;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/r0;->b(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/s;Lcom/google/android/gms/internal/firebase-auth-api/o0;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/w;)V

    return-void
.end method

.method public final p(Lcom/google/android/gms/internal/firebase-auth-api/n3;Lcom/google/android/gms/internal/firebase-auth-api/o0;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->a:Lcom/google/android/gms/internal/firebase-auth-api/p;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->f:Ljava/lang/String;

    const-string v2, "/verifyPassword"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/o;->b:Lcom/google/android/gms/internal/firebase-auth-api/w;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/o3;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/r0;->b(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/s;Lcom/google/android/gms/internal/firebase-auth-api/o0;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/w;)V

    return-void
.end method

.method public final q(Lcom/google/android/gms/internal/firebase-auth-api/p3;Lcom/google/android/gms/internal/firebase-auth-api/o0;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->a:Lcom/google/android/gms/internal/firebase-auth-api/p;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->f:Ljava/lang/String;

    const-string v2, "/verifyPhoneNumber"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/o;->b:Lcom/google/android/gms/internal/firebase-auth-api/w;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/q3;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/r0;->b(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/s;Lcom/google/android/gms/internal/firebase-auth-api/o0;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/w;)V

    return-void
.end method

.method public final r(Lcom/google/android/gms/internal/firebase-auth-api/r3;Lcom/google/android/gms/internal/firebase-auth-api/o0;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->b:Lcom/google/android/gms/internal/firebase-auth-api/q;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->f:Ljava/lang/String;

    const-string v2, "/accounts/mfaEnrollment:withdraw"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/o;->b:Lcom/google/android/gms/internal/firebase-auth-api/w;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/s3;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/r0;->b(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/s;Lcom/google/android/gms/internal/firebase-auth-api/o0;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/w;)V

    return-void
.end method

.method public final s(Lcom/google/android/gms/internal/firebase-auth-api/t1;Lcom/google/android/gms/internal/firebase-auth-api/o0;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->b:Lcom/google/android/gms/internal/firebase-auth-api/q;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->f:Ljava/lang/String;

    const-string v2, "/accounts/mfaEnrollment:finalize"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/o;->b:Lcom/google/android/gms/internal/firebase-auth-api/w;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/r1;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/r0;->b(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/s;Lcom/google/android/gms/internal/firebase-auth-api/o0;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/w;)V

    return-void
.end method

.method public final t(Lcom/google/android/gms/internal/firebase-auth-api/c3;Lcom/google/android/gms/internal/firebase-auth-api/o0;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/c3;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/v;->v()Lcom/google/android/gms/internal/firebase-auth-api/w;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/c3;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/w;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->b:Lcom/google/android/gms/internal/firebase-auth-api/q;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->f:Ljava/lang/String;

    const-string v2, "/accounts/mfaEnrollment:start"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/o;->b:Lcom/google/android/gms/internal/firebase-auth-api/w;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/z2;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/r0;->b(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/s;Lcom/google/android/gms/internal/firebase-auth-api/o0;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/w;)V

    return-void
.end method

.method public final u(Lcom/google/android/gms/internal/firebase-auth-api/u1;Lcom/google/android/gms/internal/firebase-auth-api/o0;)V
    .locals 3

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->b:Lcom/google/android/gms/internal/firebase-auth-api/q;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v;->f:Ljava/lang/String;

    const-string v2, "/accounts/mfaSignIn:finalize"

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/o;->b:Lcom/google/android/gms/internal/firebase-auth-api/w;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/s1;

    invoke-static {v1, p1, p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/r0;->b(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/s;Lcom/google/android/gms/internal/firebase-auth-api/o0;Ljava/lang/reflect/Type;Lcom/google/android/gms/internal/firebase-auth-api/w;)V

    return-void
.end method

.method public final zzi()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, v0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/v;->w(Lcom/google/android/gms/internal/firebase-auth-api/u0;Lcom/google/android/gms/internal/firebase-auth-api/p;Lcom/google/android/gms/internal/firebase-auth-api/q;)V

    return-void
.end method
