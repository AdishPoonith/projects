.class final Lcom/google/android/recaptcha/internal/zzay;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lda/p;


# instance fields
.field final synthetic zza:Ljava/lang/Exception;

.field final synthetic zzb:I

.field final synthetic zzc:Lcom/google/android/recaptcha/internal/zzn;

.field final synthetic zzd:Lcom/google/android/recaptcha/internal/zzn;

.field final synthetic zze:Ljava/lang/String;

.field final synthetic zzf:Lcom/google/android/recaptcha/internal/zzba;

.field private synthetic zzg:Ljava/lang/Object;


# direct methods
.method constructor <init>(Ljava/lang/Exception;ILcom/google/android/recaptcha/internal/zzn;Lcom/google/android/recaptcha/internal/zzn;Ljava/lang/String;Lcom/google/android/recaptcha/internal/zzba;Lv9/d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzay;->zza:Ljava/lang/Exception;

    iput p2, p0, Lcom/google/android/recaptcha/internal/zzay;->zzb:I

    iput-object p3, p0, Lcom/google/android/recaptcha/internal/zzay;->zzc:Lcom/google/android/recaptcha/internal/zzn;

    iput-object p4, p0, Lcom/google/android/recaptcha/internal/zzay;->zzd:Lcom/google/android/recaptcha/internal/zzn;

    iput-object p5, p0, Lcom/google/android/recaptcha/internal/zzay;->zze:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/recaptcha/internal/zzay;->zzf:Lcom/google/android/recaptcha/internal/zzba;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILv9/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lv9/d;)Lv9/d;
    .locals 9

    new-instance v8, Lcom/google/android/recaptcha/internal/zzay;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzay;->zza:Ljava/lang/Exception;

    iget v2, p0, Lcom/google/android/recaptcha/internal/zzay;->zzb:I

    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzay;->zzc:Lcom/google/android/recaptcha/internal/zzn;

    iget-object v4, p0, Lcom/google/android/recaptcha/internal/zzay;->zzd:Lcom/google/android/recaptcha/internal/zzn;

    iget-object v5, p0, Lcom/google/android/recaptcha/internal/zzay;->zze:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/recaptcha/internal/zzay;->zzf:Lcom/google/android/recaptcha/internal/zzba;

    move-object v0, v8

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/google/android/recaptcha/internal/zzay;-><init>(Ljava/lang/Exception;ILcom/google/android/recaptcha/internal/zzn;Lcom/google/android/recaptcha/internal/zzn;Ljava/lang/String;Lcom/google/android/recaptcha/internal/zzba;Lv9/d;)V

    iput-object p1, v8, Lcom/google/android/recaptcha/internal/zzay;->zzg:Ljava/lang/Object;

    return-object v8
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lla/k0;

    check-cast p2, Lv9/d;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzay;->create(Ljava/lang/Object;Lv9/d;)Lv9/d;

    move-result-object p1

    sget-object p2, Ls9/u;->a:Ls9/u;

    check-cast p1, Lcom/google/android/recaptcha/internal/zzay;

    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzay;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lw9/b;->c()Ljava/lang/Object;

    invoke-static {p1}, Ls9/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzay;->zzg:Ljava/lang/Object;

    check-cast p1, Lla/k0;

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzay;->zza:Ljava/lang/Exception;

    instance-of v1, v0, Lcom/google/android/recaptcha/internal/zzt;

    const/4 v2, 0x2

    if-eqz v1, :cond_0

    check-cast v0, Lcom/google/android/recaptcha/internal/zzt;

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzt;->zza()Lcom/google/android/recaptcha/internal/zzmi;

    move-result-object v0

    iget v1, p0, Lcom/google/android/recaptcha/internal/zzay;->zzb:I

    invoke-virtual {v0, v1}, Lcom/google/android/recaptcha/internal/zzmi;->zzd(I)Lcom/google/android/recaptcha/internal/zzmi;

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzmj;->zzf()Lcom/google/android/recaptcha/internal/zzmi;

    move-result-object v0

    iget v1, p0, Lcom/google/android/recaptcha/internal/zzay;->zzb:I

    invoke-virtual {v0, v1}, Lcom/google/android/recaptcha/internal/zzmi;->zzd(I)Lcom/google/android/recaptcha/internal/zzmi;

    invoke-virtual {v0, v2}, Lcom/google/android/recaptcha/internal/zzmi;->zzp(I)Lcom/google/android/recaptcha/internal/zzmi;

    invoke-virtual {v0, v2}, Lcom/google/android/recaptcha/internal/zzmi;->zze(I)Lcom/google/android/recaptcha/internal/zzmi;

    :goto_0
    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzgi;->zzh()Lcom/google/android/recaptcha/internal/zzgo;

    move-result-object v0

    check-cast v0, Lcom/google/android/recaptcha/internal/zzmj;

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzmj;->zzk()I

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzmj;->zzj()I

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzay;->zza:Ljava/lang/Exception;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/t;->b(Ljava/lang/Class;)Lia/c;

    move-result-object v1

    invoke-interface {v1}, Lia/c;->a()Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzay;->zza:Ljava/lang/Exception;

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzay;->zzc:Lcom/google/android/recaptcha/internal/zzn;

    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzay;->zzd:Lcom/google/android/recaptcha/internal/zzn;

    invoke-static {v1, v3}, Lcom/google/android/recaptcha/internal/zzar;->zza(Lcom/google/android/recaptcha/internal/zzn;Lcom/google/android/recaptcha/internal/zzn;)Lcom/google/android/recaptcha/internal/zzlg;

    move-result-object v1

    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzay;->zze:Ljava/lang/String;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_1

    const-string v3, "recaptcha.m.Main.rge"

    :cond_1
    invoke-static {p1}, Lla/l0;->d(Lla/k0;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzay;->zzf:Lcom/google/android/recaptcha/internal/zzba;

    new-array v2, v2, [Ljava/lang/String;

    invoke-static {}, Lcom/google/android/recaptcha/internal/zzeb;->zzh()Lcom/google/android/recaptcha/internal/zzeb;

    move-result-object v4

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzei;->zzd()[B

    move-result-object v0

    array-length v5, v0

    const/4 v6, 0x0

    invoke-virtual {v4, v0, v6, v5}, Lcom/google/android/recaptcha/internal/zzeb;->zzi([BII)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v6

    const/4 v0, 0x1

    invoke-static {}, Lcom/google/android/recaptcha/internal/zzeb;->zzh()Lcom/google/android/recaptcha/internal/zzeb;

    move-result-object v4

    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzei;->zzd()[B

    move-result-object v1

    array-length v5, v1

    invoke-virtual {v4, v1, v6, v5}, Lcom/google/android/recaptcha/internal/zzeb;->zzi([BII)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v2, v0

    invoke-static {p1, v3, v2}, Lcom/google/android/recaptcha/internal/zzba;->zzg(Lcom/google/android/recaptcha/internal/zzba;Ljava/lang/String;[Ljava/lang/String;)V

    :cond_2
    sget-object p1, Ls9/u;->a:Ls9/u;

    return-object p1
.end method
