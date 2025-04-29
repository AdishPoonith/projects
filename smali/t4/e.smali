.class public Lt4/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/android/gms/common/api/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/a<",
            "Lcom/google/android/gms/common/api/a$d$c;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final b:Lt4/a;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final c:Lt4/c;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final d:Lt4/j;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lq4/k;->l:Lcom/google/android/gms/common/api/a;

    sput-object v0, Lt4/e;->a:Lcom/google/android/gms/common/api/a;

    new-instance v0, Lq4/b;

    invoke-direct {v0}, Lq4/b;-><init>()V

    sput-object v0, Lt4/e;->b:Lt4/a;

    new-instance v0, Lq4/l;

    invoke-direct {v0}, Lq4/l;-><init>()V

    sput-object v0, Lt4/e;->c:Lt4/c;

    new-instance v0, Lq4/n;

    invoke-direct {v0}, Lq4/n;-><init>()V

    sput-object v0, Lt4/e;->d:Lt4/j;

    return-void
.end method

.method public static a(Landroid/app/Activity;)Lt4/b;
    .locals 1

    new-instance v0, Lq4/k;

    invoke-direct {v0, p0}, Lq4/k;-><init>(Landroid/app/Activity;)V

    return-object v0
.end method

.method public static b(Landroid/app/Activity;)Lt4/k;
    .locals 1

    new-instance v0, Lq4/p;

    invoke-direct {v0, p0}, Lq4/p;-><init>(Landroid/app/Activity;)V

    return-object v0
.end method
