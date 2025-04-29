.class Lo5/e$b;
.super Lg5/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo5/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lt5/i0;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lt5/i0;)V
    .locals 0

    invoke-direct {p0}, Lg5/t;-><init>()V

    iput-object p1, p0, Lo5/e$b;->a:Ljava/lang/String;

    iput-object p2, p0, Lo5/e$b;->b:Lt5/i0;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Lt5/i0;Lo5/e$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lo5/e$b;-><init>(Ljava/lang/String;Lt5/i0;)V

    return-void
.end method

.method private static a(Lt5/i0;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lo5/e$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-eq p0, v0, :cond_0

    const-string p0, "UNKNOWN"

    return-object p0

    :cond_0
    const-string p0, "CRUNCHY"

    return-object p0

    :cond_1
    const-string p0, "RAW"

    return-object p0

    :cond_2
    const-string p0, "LEGACY"

    return-object p0

    :cond_3
    const-string p0, "TINK"

    return-object p0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lo5/e$b;->a:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lo5/e$b;->b:Lt5/i0;

    invoke-static {v1}, Lo5/e$b;->a(Lt5/i0;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "(typeUrl=%s, outputPrefixType=%s)"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
