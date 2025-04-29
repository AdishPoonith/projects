.class public final Ls9/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ls9/u;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls9/u;

    invoke-direct {v0}, Ls9/u;-><init>()V

    sput-object v0, Ls9/u;->a:Ls9/u;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "kotlin.Unit"

    return-object v0
.end method
