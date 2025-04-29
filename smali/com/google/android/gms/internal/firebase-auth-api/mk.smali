.class public final Lcom/google/android/gms/internal/firebase-auth-api/mk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/ok;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/google/android/gms/internal/firebase-auth-api/gv;

.field private final c:Lcom/google/android/gms/internal/firebase-auth-api/m4;

.field private final d:Lcom/google/android/gms/internal/firebase-auth-api/ur;

.field private final e:Lcom/google/android/gms/internal/firebase-auth-api/ct;

.field private final f:Ljava/lang/Integer;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/m4;Lcom/google/android/gms/internal/firebase-auth-api/ur;Lcom/google/android/gms/internal/firebase-auth-api/ct;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mk;->a:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/xk;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/gv;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/mk;->b:Lcom/google/android/gms/internal/firebase-auth-api/gv;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/mk;->c:Lcom/google/android/gms/internal/firebase-auth-api/m4;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/mk;->d:Lcom/google/android/gms/internal/firebase-auth-api/ur;

    iput-object p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/mk;->e:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    iput-object p5, p0, Lcom/google/android/gms/internal/firebase-auth-api/mk;->f:Ljava/lang/Integer;

    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/m4;Lcom/google/android/gms/internal/firebase-auth-api/ur;Lcom/google/android/gms/internal/firebase-auth-api/ct;Ljava/lang/Integer;)Lcom/google/android/gms/internal/firebase-auth-api/mk;
    .locals 7

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ct;->n:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    if-ne p3, v0, :cond_1

    if-nez p4, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Keys with output prefix type raw should not have an id requirement."

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    if-eqz p4, :cond_2

    :goto_0
    new-instance v6, Lcom/google/android/gms/internal/firebase-auth-api/mk;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/firebase-auth-api/mk;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/m4;Lcom/google/android/gms/internal/firebase-auth-api/ur;Lcom/google/android/gms/internal/firebase-auth-api/ct;Ljava/lang/Integer;)V

    return-object v6

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Keys with output prefix type different from raw should have an id requirement."

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final b()Lcom/google/android/gms/internal/firebase-auth-api/ur;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mk;->d:Lcom/google/android/gms/internal/firebase-auth-api/ur;

    return-object v0
.end method

.method public final c()Lcom/google/android/gms/internal/firebase-auth-api/ct;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mk;->e:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    return-object v0
.end method

.method public final d()Lcom/google/android/gms/internal/firebase-auth-api/m4;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mk;->c:Lcom/google/android/gms/internal/firebase-auth-api/m4;

    return-object v0
.end method

.method public final e()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mk;->f:Ljava/lang/Integer;

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mk;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final zzd()Lcom/google/android/gms/internal/firebase-auth-api/gv;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/mk;->b:Lcom/google/android/gms/internal/firebase-auth-api/gv;

    return-object v0
.end method
