.class final Lcom/google/android/recaptcha/internal/zzcy;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lda/p;


# instance fields
.field zza:Ljava/lang/Object;

.field zzb:Ljava/lang/Object;

.field zzc:Ljava/lang/Object;

.field zzd:I

.field final synthetic zze:Lcom/google/android/recaptcha/internal/zzda;

.field final synthetic zzf:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/recaptcha/internal/zzda;Ljava/lang/String;Lv9/d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzcy;->zze:Lcom/google/android/recaptcha/internal/zzda;

    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzcy;->zzf:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILv9/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lv9/d;)Lv9/d;
    .locals 2

    new-instance p1, Lcom/google/android/recaptcha/internal/zzcy;

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzcy;->zze:Lcom/google/android/recaptcha/internal/zzda;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzcy;->zzf:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lcom/google/android/recaptcha/internal/zzcy;-><init>(Lcom/google/android/recaptcha/internal/zzda;Ljava/lang/String;Lv9/d;)V

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lla/k0;

    check-cast p2, Lv9/d;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzcy;->create(Ljava/lang/Object;Lv9/d;)Lv9/d;

    move-result-object p1

    sget-object p2, Ls9/u;->a:Ls9/u;

    check-cast p1, Lcom/google/android/recaptcha/internal/zzcy;

    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzcy;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    invoke-static {}, Lw9/b;->c()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/google/android/recaptcha/internal/zzcy;->zzd:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    if-eq v1, v2, :cond_0

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzcy;->zza:Ljava/lang/Object;

    :try_start_0
    invoke-static {p1}, Ls9/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :cond_0
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzcy;->zzc:Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzcy;->zzb:Ljava/lang/Object;

    iget-object v4, p0, Lcom/google/android/recaptcha/internal/zzcy;->zza:Ljava/lang/Object;

    invoke-static {p1}, Ls9/o;->b(Ljava/lang/Object;)V

    move-object v13, v4

    move-object v4, v1

    move-object v1, v13

    goto :goto_0

    :cond_1
    invoke-static {p1}, Ls9/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzcy;->zze:Lcom/google/android/recaptcha/internal/zzda;

    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzda;->zzn(Lcom/google/android/recaptcha/internal/zzda;)Lkotlinx/coroutines/sync/b;

    move-result-object v1

    iget-object v4, p0, Lcom/google/android/recaptcha/internal/zzcy;->zzf:Ljava/lang/String;

    iput-object v1, p0, Lcom/google/android/recaptcha/internal/zzcy;->zza:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzcy;->zzb:Ljava/lang/Object;

    iput-object v4, p0, Lcom/google/android/recaptcha/internal/zzcy;->zzc:Ljava/lang/Object;

    iput v2, p0, Lcom/google/android/recaptcha/internal/zzcy;->zzd:I

    invoke-interface {v1, v3, p0}, Lkotlinx/coroutines/sync/b;->b(Ljava/lang/Object;Lv9/d;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v0, :cond_3

    move-object v2, p1

    :goto_0
    :try_start_1
    move-object p1, v2

    check-cast p1, Lcom/google/android/recaptcha/internal/zzda;

    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzda;->zzc(Lcom/google/android/recaptcha/internal/zzda;)Lcom/google/android/recaptcha/internal/zzr;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzr;->zzb()Ljava/lang/String;

    move-result-object v5

    move-object p1, v2

    check-cast p1, Lcom/google/android/recaptcha/internal/zzda;

    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzda;->zzj(Lcom/google/android/recaptcha/internal/zzda;)Ljava/lang/String;

    move-result-object v6

    move-object p1, v2

    check-cast p1, Lcom/google/android/recaptcha/internal/zzda;

    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzda;->zzi(Lcom/google/android/recaptcha/internal/zzda;)Ljava/lang/String;

    move-result-object v8

    move-object p1, v2

    check-cast p1, Lcom/google/android/recaptcha/internal/zzda;

    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzda;->zzh(Lcom/google/android/recaptcha/internal/zzda;)Ljava/lang/String;

    move-result-object v9

    move-object p1, v2

    check-cast p1, Lcom/google/android/recaptcha/internal/zzda;

    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzda;->zza(Lcom/google/android/recaptcha/internal/zzda;)Landroid/content/Context;

    move-result-object v10

    check-cast v2, Lcom/google/android/recaptcha/internal/zzda;

    invoke-static {v2}, Lcom/google/android/recaptcha/internal/zzda;->zzc(Lcom/google/android/recaptcha/internal/zzda;)Lcom/google/android/recaptcha/internal/zzr;

    move-result-object v11

    iput-object v1, p0, Lcom/google/android/recaptcha/internal/zzcy;->zza:Ljava/lang/Object;

    iput-object v3, p0, Lcom/google/android/recaptcha/internal/zzcy;->zzb:Ljava/lang/Object;

    iput-object v3, p0, Lcom/google/android/recaptcha/internal/zzcy;->zzc:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, p0, Lcom/google/android/recaptcha/internal/zzcy;->zzd:I

    move-object v7, v4

    check-cast v7, Ljava/lang/String;

    move-object v12, p0

    invoke-static/range {v5 .. v12}, Lcom/google/android/recaptcha/internal/zzbj;->zzb(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Lcom/google/android/recaptcha/internal/zzr;Lv9/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eq p1, v0, :cond_2

    move-object v0, v1

    :goto_1
    :try_start_2
    sget-object p1, Ls9/u;->a:Ls9/u;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {v0, v3}, Lkotlinx/coroutines/sync/b;->a(Ljava/lang/Object;)V

    return-object p1

    :cond_2
    return-object v0

    :catchall_1
    move-exception p1

    move-object v0, v1

    :goto_2
    invoke-interface {v0, v3}, Lkotlinx/coroutines/sync/b;->a(Ljava/lang/Object;)V

    throw p1

    :cond_3
    return-object v0
.end method
