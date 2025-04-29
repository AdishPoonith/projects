.class public final Lc0/a$a;
.super Lc0/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final b:Lc0/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc0/a$a;

    invoke-direct {v0}, Lc0/a$a;-><init>()V

    sput-object v0, Lc0/a$a;->b:Lc0/a$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lc0/a;-><init>()V

    return-void
.end method
