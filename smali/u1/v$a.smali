.class public final Lu1/v$a;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu1/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final j:Ls1/n1;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ls1/n1;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lu1/v$a;->j:Ls1/n1;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;Ls1/n1;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    iput-object p2, p0, Lu1/v$a;->j:Ls1/n1;

    return-void
.end method
