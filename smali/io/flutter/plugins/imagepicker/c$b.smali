.class public final enum Lio/flutter/plugins/imagepicker/c$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/imagepicker/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/flutter/plugins/imagepicker/c$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum j:Lio/flutter/plugins/imagepicker/c$b;

.field public static final enum k:Lio/flutter/plugins/imagepicker/c$b;

.field private static final synthetic l:[Lio/flutter/plugins/imagepicker/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lio/flutter/plugins/imagepicker/c$b;

    const-string v1, "IMAGE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/flutter/plugins/imagepicker/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/plugins/imagepicker/c$b;->j:Lio/flutter/plugins/imagepicker/c$b;

    new-instance v1, Lio/flutter/plugins/imagepicker/c$b;

    const-string v3, "VIDEO"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lio/flutter/plugins/imagepicker/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/flutter/plugins/imagepicker/c$b;->k:Lio/flutter/plugins/imagepicker/c$b;

    const/4 v3, 0x2

    new-array v3, v3, [Lio/flutter/plugins/imagepicker/c$b;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lio/flutter/plugins/imagepicker/c$b;->l:[Lio/flutter/plugins/imagepicker/c$b;

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

.method public static valueOf(Ljava/lang/String;)Lio/flutter/plugins/imagepicker/c$b;
    .locals 1

    const-class v0, Lio/flutter/plugins/imagepicker/c$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/flutter/plugins/imagepicker/c$b;

    return-object p0
.end method

.method public static values()[Lio/flutter/plugins/imagepicker/c$b;
    .locals 1

    sget-object v0, Lio/flutter/plugins/imagepicker/c$b;->l:[Lio/flutter/plugins/imagepicker/c$b;

    invoke-virtual {v0}, [Lio/flutter/plugins/imagepicker/c$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/flutter/plugins/imagepicker/c$b;

    return-object v0
.end method
