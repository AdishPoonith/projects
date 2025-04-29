.class public final enum Lz0/f$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz0/f$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lz0/f$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum j:Lz0/f$a;

.field public static final enum k:Lz0/f$a;

.field private static final synthetic l:[Lz0/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lz0/f$a;

    const-string v1, "MTML_INTEGRITY_DETECT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lz0/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz0/f$a;->j:Lz0/f$a;

    new-instance v0, Lz0/f$a;

    const-string v1, "MTML_APP_EVENT_PREDICTION"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lz0/f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz0/f$a;->k:Lz0/f$a;

    invoke-static {}, Lz0/f$a;->b()[Lz0/f$a;

    move-result-object v0

    sput-object v0, Lz0/f$a;->l:[Lz0/f$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic b()[Lz0/f$a;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lz0/f$a;

    sget-object v1, Lz0/f$a;->j:Lz0/f$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lz0/f$a;->k:Lz0/f$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lz0/f$a;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lz0/f$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lz0/f$a;

    return-object p0
.end method

.method public static values()[Lz0/f$a;
    .locals 2

    sget-object v0, Lz0/f$a;->l:[Lz0/f$a;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lz0/f$a;

    return-object v0
.end method


# virtual methods
.method public final g()Ljava/lang/String;
    .locals 2

    sget-object v0, Lz0/f$a$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const-string v0, "app_event_pred"

    goto :goto_0

    :cond_0
    new-instance v0, Ls9/l;

    invoke-direct {v0}, Ls9/l;-><init>()V

    throw v0

    :cond_1
    const-string v0, "integrity_detect"

    :goto_0
    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 2

    sget-object v0, Lz0/f$a$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const-string v0, "MTML_APP_EVENT_PRED"

    goto :goto_0

    :cond_0
    new-instance v0, Ls9/l;

    invoke-direct {v0}, Ls9/l;-><init>()V

    throw v0

    :cond_1
    const-string v0, "MTML_INTEGRITY_DETECT"

    :goto_0
    return-object v0
.end method
