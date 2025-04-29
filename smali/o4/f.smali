.class public final Lo4/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lb4/d;

.field public static final b:[Lb4/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lb4/d;

    const-string v1, "CLIENT_TELEMETRY"

    const-wide/16 v2, 0x1

    invoke-direct {v0, v1, v2, v3}, Lb4/d;-><init>(Ljava/lang/String;J)V

    sput-object v0, Lo4/f;->a:Lb4/d;

    const/4 v1, 0x1

    new-array v1, v1, [Lb4/d;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, Lo4/f;->b:[Lb4/d;

    return-void
.end method
