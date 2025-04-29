.class public Lc4/g;
.super Ld4/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lc4/g;",
            ">;"
        }
    .end annotation
.end field

.field static final x:[Lcom/google/android/gms/common/api/Scope;

.field static final y:[Lb4/d;


# instance fields
.field final j:I

.field final k:I

.field final l:I

.field m:Ljava/lang/String;

.field n:Landroid/os/IBinder;

.field o:[Lcom/google/android/gms/common/api/Scope;

.field p:Landroid/os/Bundle;

.field q:Landroid/accounts/Account;

.field r:[Lb4/d;

.field s:[Lb4/d;

.field final t:Z

.field final u:I

.field v:Z

.field private final w:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lc4/l1;

    invoke-direct {v0}, Lc4/l1;-><init>()V

    sput-object v0, Lc4/g;->CREATOR:Landroid/os/Parcelable$Creator;

    const/4 v0, 0x0

    new-array v1, v0, [Lcom/google/android/gms/common/api/Scope;

    sput-object v1, Lc4/g;->x:[Lcom/google/android/gms/common/api/Scope;

    new-array v0, v0, [Lb4/d;

    sput-object v0, Lc4/g;->y:[Lb4/d;

    return-void
.end method

.method constructor <init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[Lb4/d;[Lb4/d;ZIZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ld4/a;-><init>()V

    if-nez p6, :cond_0

    sget-object p6, Lc4/g;->x:[Lcom/google/android/gms/common/api/Scope;

    :cond_0
    if-nez p7, :cond_1

    new-instance p7, Landroid/os/Bundle;

    invoke-direct {p7}, Landroid/os/Bundle;-><init>()V

    :cond_1
    if-nez p9, :cond_2

    sget-object p9, Lc4/g;->y:[Lb4/d;

    :cond_2
    if-nez p10, :cond_3

    sget-object p10, Lc4/g;->y:[Lb4/d;

    :cond_3
    iput p1, p0, Lc4/g;->j:I

    iput p2, p0, Lc4/g;->k:I

    iput p3, p0, Lc4/g;->l:I

    const-string p2, "com.google.android.gms"

    invoke-virtual {p2, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    iput-object p2, p0, Lc4/g;->m:Ljava/lang/String;

    goto :goto_0

    :cond_4
    iput-object p4, p0, Lc4/g;->m:Ljava/lang/String;

    :goto_0
    const/4 p2, 0x2

    if-ge p1, p2, :cond_6

    if-eqz p5, :cond_5

    invoke-static {p5}, Lc4/k$a;->x(Landroid/os/IBinder;)Lc4/k;

    move-result-object p1

    invoke-static {p1}, Lc4/a;->M(Lc4/k;)Landroid/accounts/Account;

    move-result-object p1

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    :goto_1
    iput-object p1, p0, Lc4/g;->q:Landroid/accounts/Account;

    goto :goto_2

    :cond_6
    iput-object p5, p0, Lc4/g;->n:Landroid/os/IBinder;

    iput-object p8, p0, Lc4/g;->q:Landroid/accounts/Account;

    :goto_2
    iput-object p6, p0, Lc4/g;->o:[Lcom/google/android/gms/common/api/Scope;

    iput-object p7, p0, Lc4/g;->p:Landroid/os/Bundle;

    iput-object p9, p0, Lc4/g;->r:[Lb4/d;

    iput-object p10, p0, Lc4/g;->s:[Lb4/d;

    iput-boolean p11, p0, Lc4/g;->t:Z

    iput p12, p0, Lc4/g;->u:I

    iput-boolean p13, p0, Lc4/g;->v:Z

    iput-object p14, p0, Lc4/g;->w:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lc4/l1;->a(Lc4/g;Landroid/os/Parcel;I)V

    return-void
.end method

.method public final zza()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc4/g;->w:Ljava/lang/String;

    return-object v0
.end method
