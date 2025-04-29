.class final Lcom/google/android/gms/internal/firebase-auth-api/sw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/o0;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/firebase-auth-api/o0;

.field final synthetic b:Lcom/google/android/gms/internal/firebase-auth-api/j2;

.field final synthetic c:Lcom/google/android/gms/internal/firebase-auth-api/tw;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/tw;Lcom/google/android/gms/internal/firebase-auth-api/o0;Lcom/google/android/gms/internal/firebase-auth-api/j2;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/sw;->c:Lcom/google/android/gms/internal/firebase-auth-api/tw;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/sw;->a:Lcom/google/android/gms/internal/firebase-auth-api/o0;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/sw;->b:Lcom/google/android/gms/internal/firebase-auth-api/j2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, La6/l;->a(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/sw;->c:Lcom/google/android/gms/internal/firebase-auth-api/tw;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/tw;->b:Lcom/google/android/gms/internal/firebase-auth-api/g;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/g;->h(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method public final bridge synthetic zzb(Ljava/lang/Object;)V
    .locals 6

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/y1;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/y1;->a()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lcom/google/android/gms/internal/firebase-auth-api/z1;

    new-instance v4, Lcom/google/android/gms/internal/firebase-auth-api/v2;

    invoke-direct {v4}, Lcom/google/android/gms/internal/firebase-auth-api/v2;-><init>()V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/sw;->b:Lcom/google/android/gms/internal/firebase-auth-api/j2;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/j2;->E()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Lcom/google/android/gms/internal/firebase-auth-api/v2;->d(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/v2;

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/sw;->c:Lcom/google/android/gms/internal/firebase-auth-api/tw;

    iget-object p1, p1, Lcom/google/android/gms/internal/firebase-auth-api/tw;->a:Ljava/lang/String;

    invoke-virtual {v4, p1}, Lcom/google/android/gms/internal/firebase-auth-api/v2;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/v2;

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/sw;->c:Lcom/google/android/gms/internal/firebase-auth-api/tw;

    iget-object v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/tw;->c:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    iget-object v1, p1, Lcom/google/android/gms/internal/firebase-auth-api/tw;->b:Lcom/google/android/gms/internal/firebase-auth-api/g;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/sw;->b:Lcom/google/android/gms/internal/firebase-auth-api/j2;

    iget-object v5, p0, Lcom/google/android/gms/internal/firebase-auth-api/sw;->a:Lcom/google/android/gms/internal/firebase-auth-api/o0;

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->x(Lcom/google/android/gms/internal/firebase-auth-api/rx;Lcom/google/android/gms/internal/firebase-auth-api/g;Lcom/google/android/gms/internal/firebase-auth-api/j2;Lcom/google/android/gms/internal/firebase-auth-api/z1;Lcom/google/android/gms/internal/firebase-auth-api/v2;Lcom/google/android/gms/internal/firebase-auth-api/n0;)V

    return-void

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/sw;->a:Lcom/google/android/gms/internal/firebase-auth-api/o0;

    const-string v0, "No users."

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/n0;->zza(Ljava/lang/String;)V

    return-void
.end method
