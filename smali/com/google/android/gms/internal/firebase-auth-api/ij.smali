.class final synthetic Lcom/google/android/gms/internal/firebase-auth-api/ij;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final synthetic a:[I

.field static final synthetic b:[I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ur;->values()[Lcom/google/android/gms/internal/firebase-auth-api/ur;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ij;->b:[I

    const/4 v1, 0x1

    :try_start_0
    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/ur;->l:Lcom/google/android/gms/internal/firebase-auth-api/ur;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v0, 0x2

    :try_start_1
    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/ij;->b:[I

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/ur;->m:Lcom/google/android/gms/internal/firebase-auth-api/ur;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v0, v2, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ct;->values()[Lcom/google/android/gms/internal/firebase-auth-api/ct;

    move-result-object v2

    array-length v2, v2

    new-array v2, v2, [I

    sput-object v2, Lcom/google/android/gms/internal/firebase-auth-api/ij;->a:[I

    :try_start_2
    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/ct;->l:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aput v1, v2, v3
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/ij;->a:[I

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/ct;->m:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aput v0, v1, v2
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :try_start_4
    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ij;->a:[I

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/ct;->n:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    :try_start_5
    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ij;->a:[I

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/ct;->o:Lcom/google/android/gms/internal/firebase-auth-api/ct;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    return-void
.end method
