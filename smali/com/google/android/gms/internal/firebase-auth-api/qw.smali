.class final Lcom/google/android/gms/internal/firebase-auth-api/qw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/o0;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/firebase-auth-api/i3;

.field final synthetic b:Lcom/google/android/gms/internal/firebase-auth-api/g;

.field final synthetic c:Lcom/google/android/gms/internal/firebase-auth-api/rx;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/rx;Lcom/google/android/gms/internal/firebase-auth-api/i3;Lcom/google/android/gms/internal/firebase-auth-api/g;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/qw;->c:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/qw;->a:Lcom/google/android/gms/internal/firebase-auth-api/i3;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/qw;->b:Lcom/google/android/gms/internal/firebase-auth-api/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, La6/l;->a(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/qw;->b:Lcom/google/android/gms/internal/firebase-auth-api/g;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/g;->h(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method public final bridge synthetic zzb(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/j2;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/qw;->a:Lcom/google/android/gms/internal/firebase-auth-api/i3;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/i3;->D(Z)Lcom/google/android/gms/internal/firebase-auth-api/i3;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/qw;->a:Lcom/google/android/gms/internal/firebase-auth-api/i3;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/j2;->E()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/i3;->C(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/i3;

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/qw;->c:Lcom/google/android/gms/internal/firebase-auth-api/rx;

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/rx;->s(Lcom/google/android/gms/internal/firebase-auth-api/rx;)Lcom/google/android/gms/internal/firebase-auth-api/p0;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/qw;->a:Lcom/google/android/gms/internal/firebase-auth-api/i3;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/pw;

    invoke-direct {v1, p0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/pw;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/qw;Lcom/google/android/gms/internal/firebase-auth-api/o0;)V

    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/p0;->n(Lcom/google/android/gms/internal/firebase-auth-api/i3;Lcom/google/android/gms/internal/firebase-auth-api/o0;)V

    return-void
.end method
