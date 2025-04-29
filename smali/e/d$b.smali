.class public final Le/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/d$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Le/d$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le/d$b;

    invoke-direct {v0}, Le/d$b;-><init>()V

    sput-object v0, Le/d$b;->a:Le/d$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
