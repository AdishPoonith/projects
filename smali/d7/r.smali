.class public final Ld7/r;
.super Lcom/google/protobuf/z;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld7/r$b;,
        Ld7/r$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/z<",
        "Ld7/r;",
        "Ld7/r$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Ld7/r;

.field public static final DOCUMENT_CHANGE_FIELD_NUMBER:I = 0x3

.field public static final DOCUMENT_DELETE_FIELD_NUMBER:I = 0x4

.field public static final DOCUMENT_REMOVE_FIELD_NUMBER:I = 0x6

.field public static final FILTER_FIELD_NUMBER:I = 0x5

.field private static volatile PARSER:Lcom/google/protobuf/f1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/f1<",
            "Ld7/r;",
            ">;"
        }
    .end annotation
.end field

.field public static final TARGET_CHANGE_FIELD_NUMBER:I = 0x2


# instance fields
.field private responseTypeCase_:I

.field private responseType_:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ld7/r;

    invoke-direct {v0}, Ld7/r;-><init>()V

    sput-object v0, Ld7/r;->DEFAULT_INSTANCE:Ld7/r;

    const-class v1, Ld7/r;

    invoke-static {v1, v0}, Lcom/google/protobuf/z;->b0(Ljava/lang/Class;Lcom/google/protobuf/z;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/z;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ld7/r;->responseTypeCase_:I

    return-void
.end method

.method static synthetic e0()Ld7/r;
    .locals 1

    sget-object v0, Ld7/r;->DEFAULT_INSTANCE:Ld7/r;

    return-object v0
.end method

.method public static f0()Ld7/r;
    .locals 1

    sget-object v0, Ld7/r;->DEFAULT_INSTANCE:Ld7/r;

    return-object v0
.end method


# virtual methods
.method protected final F(Lcom/google/protobuf/z$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Ld7/r$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    const/4 p2, 0x1

    const/4 p3, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    return-object p3

    :pswitch_1
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, Ld7/r;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_1

    const-class p2, Ld7/r;

    monitor-enter p2

    :try_start_0
    sget-object p1, Ld7/r;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/z$b;

    sget-object p3, Ld7/r;->DEFAULT_INSTANCE:Ld7/r;

    invoke-direct {p1, p3}, Lcom/google/protobuf/z$b;-><init>(Lcom/google/protobuf/z;)V

    sput-object p1, Ld7/r;->PARSER:Lcom/google/protobuf/f1;

    :cond_0
    monitor-exit p2

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_0
    return-object p1

    :pswitch_3
    sget-object p1, Ld7/r;->DEFAULT_INSTANCE:Ld7/r;

    return-object p1

    :pswitch_4
    const/4 p1, 0x7

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "responseType_"

    aput-object v0, p1, p3

    const-string p3, "responseTypeCase_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-class p3, Ld7/z;

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-class p3, Ld7/j;

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-class p3, Ld7/k;

    aput-object p3, p1, p2

    const/4 p2, 0x5

    const-class p3, Ld7/o;

    aput-object p3, p1, p2

    const/4 p2, 0x6

    const-class p3, Ld7/m;

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0005\u0001\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000"

    sget-object p3, Ld7/r;->DEFAULT_INSTANCE:Ld7/r;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/z;->T(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Ld7/r$b;

    invoke-direct {p1, p3}, Ld7/r$b;-><init>(Ld7/r$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Ld7/r;

    invoke-direct {p1}, Ld7/r;-><init>()V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public g0()Ld7/j;
    .locals 2

    iget v0, p0, Ld7/r;->responseTypeCase_:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ld7/r;->responseType_:Ljava/lang/Object;

    check-cast v0, Ld7/j;

    return-object v0

    :cond_0
    invoke-static {}, Ld7/j;->f0()Ld7/j;

    move-result-object v0

    return-object v0
.end method

.method public h0()Ld7/k;
    .locals 2

    iget v0, p0, Ld7/r;->responseTypeCase_:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ld7/r;->responseType_:Ljava/lang/Object;

    check-cast v0, Ld7/k;

    return-object v0

    :cond_0
    invoke-static {}, Ld7/k;->f0()Ld7/k;

    move-result-object v0

    return-object v0
.end method

.method public i0()Ld7/m;
    .locals 2

    iget v0, p0, Ld7/r;->responseTypeCase_:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ld7/r;->responseType_:Ljava/lang/Object;

    check-cast v0, Ld7/m;

    return-object v0

    :cond_0
    invoke-static {}, Ld7/m;->f0()Ld7/m;

    move-result-object v0

    return-object v0
.end method

.method public j0()Ld7/o;
    .locals 2

    iget v0, p0, Ld7/r;->responseTypeCase_:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ld7/r;->responseType_:Ljava/lang/Object;

    check-cast v0, Ld7/o;

    return-object v0

    :cond_0
    invoke-static {}, Ld7/o;->g0()Ld7/o;

    move-result-object v0

    return-object v0
.end method

.method public k0()Ld7/r$c;
    .locals 1

    iget v0, p0, Ld7/r;->responseTypeCase_:I

    invoke-static {v0}, Ld7/r$c;->b(I)Ld7/r$c;

    move-result-object v0

    return-object v0
.end method

.method public l0()Ld7/z;
    .locals 2

    iget v0, p0, Ld7/r;->responseTypeCase_:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ld7/r;->responseType_:Ljava/lang/Object;

    check-cast v0, Ld7/z;

    return-object v0

    :cond_0
    invoke-static {}, Ld7/z;->g0()Ld7/z;

    move-result-object v0

    return-object v0
.end method
