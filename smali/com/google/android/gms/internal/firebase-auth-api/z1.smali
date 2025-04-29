.class public final Lcom/google/android/gms/internal/firebase-auth-api/z1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Z

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Lcom/google/android/gms/internal/firebase-auth-api/p2;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:J

.field private j:J

.field private k:Z

.field private l:Lcom/google/firebase/auth/a2;

.field private m:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/p2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/p2;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->f:Lcom/google/android/gms/internal/firebase-auth-api/p2;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/p2;Ljava/lang/String;Ljava/lang/String;JJZLcom/google/firebase/auth/a2;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->b:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->c:Z

    iput-object p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->e:Ljava/lang/String;

    invoke-static {p6}, Lcom/google/android/gms/internal/firebase-auth-api/p2;->b(Lcom/google/android/gms/internal/firebase-auth-api/p2;)Lcom/google/android/gms/internal/firebase-auth-api/p2;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->f:Lcom/google/android/gms/internal/firebase-auth-api/p2;

    iput-object p7, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->g:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->h:Ljava/lang/String;

    iput-wide p9, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->i:J

    iput-wide p11, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->j:J

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->k:Z

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->l:Lcom/google/firebase/auth/a2;

    iput-object p15, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->m:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->i:J

    return-wide v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->j:J

    return-wide v0
.end method

.method public final c()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final d()Lcom/google/firebase/auth/a2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->l:Lcom/google/firebase/auth/a2;

    return-object v0
.end method

.method public final e(Lcom/google/firebase/auth/a2;)Lcom/google/android/gms/internal/firebase-auth-api/z1;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->l:Lcom/google/firebase/auth/a2;

    return-object p0
.end method

.method public final f(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/z1;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->d:Ljava/lang/String;

    return-object p0
.end method

.method public final g(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/z1;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->b:Ljava/lang/String;

    return-object p0
.end method

.method public final h(Z)Lcom/google/android/gms/internal/firebase-auth-api/z1;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->k:Z

    return-object p0
.end method

.method public final i(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/z1;
    .locals 0

    invoke-static {p1}, Lc4/s;->f(Ljava/lang/String;)Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->g:Ljava/lang/String;

    return-object p0
.end method

.method public final j(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/z1;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->e:Ljava/lang/String;

    return-object p0
.end method

.method public final k(Ljava/util/List;)Lcom/google/android/gms/internal/firebase-auth-api/z1;
    .locals 1

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/p2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/p2;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->f:Lcom/google/android/gms/internal/firebase-auth-api/p2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/p2;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public final l()Lcom/google/android/gms/internal/firebase-auth-api/p2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->f:Lcom/google/android/gms/internal/firebase-auth-api/p2;

    return-object v0
.end method

.method public final m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final n()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final o()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final p()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->h:Ljava/lang/String;

    return-object v0
.end method

.method public final q()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->m:Ljava/util/List;

    return-object v0
.end method

.method public final r()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->f:Lcom/google/android/gms/internal/firebase-auth-api/p2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/p2;->c()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final s()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->c:Z

    return v0
.end method

.method public final t()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/z1;->k:Z

    return v0
.end method
